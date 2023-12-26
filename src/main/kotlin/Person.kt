import org.json.JSONObject

class Person {


    fun abc() {

        val jsonString = """

    {

      "name": "John",

      "age": 30,

      "city": "New York",
      
      "myArray": [1,2,3,4,5],
        
      "myJsonObj":{"key_1":"value_1","key_2":"value_2"}
    }

  """


        val json = JSONObject(jsonString)

        val name = json.getString("name")

        val age = json.getInt("age")

        val city = json.getString("city")

        val myArray=json.getJSONArray("myArray")

        val myJSONObject=json.getJSONObject("myJsonObj")

        println("Name: $name")

        println("Age: $age")

        println("City: $city")

        println("MyArray: $myArray")

        println("MyJsonObject: $myJSONObject")
    }

}