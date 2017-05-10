For today's assignment, we're going to be designing our own API. First things first, create a `Cheeseburger` class.

But to get you warmed up..

![test](https://s-media-cache-ak0.pinimg.com/originals/31/70/b6/3170b62439d3a31fd2f50ac4352180af--hamburgers-soy.gif)

This class should have fields to hold:
* Whether or not there's mayo
* How many patties
* How many buns
* How many strips of Bacon
* Special instructions for making said cheeseburger

Our job is to create an API that will allow users to:
* create cheeseburgers and 
* list them. 

To accomplish this, we'll be using a REST API with Spark. We will need to be able to POST objects in one route, and GET a list of all the cheeseburgers we currently know about in the other. We can just store our cheeseburgers in a public static ArrayList field on the Main class for now.

REMEMBER to use Postman to test your routes. It will help you with debugging immensely. 
