package com.company;

import jodd.json.JsonParser;
import jodd.json.JsonSerializer;
import spark.ModelAndView;
import spark.Session;
import spark.Spark;
import spark.template.mustache.MustacheTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    //Store our cheeseburgers in a public static ArrayList field
    public static ArrayList<Cheeseburger> cbList = new ArrayList<>();

    public static void main(String[] args) {
        Spark.init();
        // Get a list of all the cheeseburgers that we currently know about.
        cbList.add(new Cheeseburger(true, 1, 2, 2, "pickles on the side"));
        cbList.add(new Cheeseburger(true, 1, 1, 0, "all the way"));
        cbList.add(new Cheeseburger(false, 1, 0, 2, "no pickles"));

        Spark.get(
                "/cheeseburgers",
                ((request, response) -> {
                    JsonSerializer serializer = new JsonSerializer();
                    String json = serializer.serialize(cbList);
                    return json;
                })
        );

        // Post objects in one route
        Spark.post(
                "/cheeseburgers",
                ((request, response) -> {
                    // get the json from the request < request.body();
                    String json = request.body();

                    // parse that data into a cheeseburger < jsonParser parser / parse (json, cheeseburger.class); > cbList.add (__); return"";
                    JsonParser parser = new JsonParser(); //.parse json, Cheeseburger.Cheeseburger);
                    Cheeseburger cb = parser.parse(json, Cheeseburger.class);

                    //add the cheeseburger tot he ArrayList
                    cbList.add(cb);
                    return "";
                })
        );
    }
}
// Get a list of all the cheeseburgers that we currently know about.

// Our job is to create an API that will allow users to:
// - create cheeseburgers and
// - list them.

// To accomplish this, we'll be using a REST API with Spark.
// We will need to be able to POST objects in one route, and
// GET a list of all the cheeseburgers we currently know about
// in the other Route. We can just store our cheeseburgers in a
// public static ArrayList field on the Main class for now.
// REMEMBER to use Postman to test your routes. It will help
// you with debugging immensely.