## Traini8: Problem Statement

Assume that you are working at a startup Traini8. You have to make an MVP for a registry for Govt funded Training Centers with the following minimum requirements.
In the MVP, you have to create a Spring or Play project with support for two APIs, which are explained below.
 
 ## First API
 
  ● Create a POST api to create and save a new training center with the following fields.
     
       ○ CenterName (text)* (less than 40 characters)
       
       ○ CenterCode (text)* (exactly 12 character alphanumeric)
       
       ○ Address (object)*
     
             ■ Detailed Address
     
             ■ City
             
             ■ State
             
             ■ Pincode
           
       ○ Student Capacity (number)
       
       ○ Courses Offered (List<text>)
       
       ○ CreatedOn (Epoch time generated by System, not by user)
       
       ○ ContactEmail (text) (If present, email should be validated)
       
       ○ ContactPhone (text)* (Phone number validation )
   
 ● Apishould accept data in json.
 
 ● Validations for mandatory fields should be done, along with phone, email and size validations wherever mentioned in the aforementioned fields should be done
 
 ● As mentioned above with the fields, createdOn field should be populated from the server based on the server timestamp, and the user’s input if present for this field
 should be discarded.
 
 ● Onvalidation failure, an appropriate error message should be shown. This should be handled by an ExceptionHandler.
 
 ● Onsuccess, the api should return the newly saved TraningCenter information in json format
 
 ## Second API
 
   ● Create a GET api to get list of all stored training centers information.
 
   ● Apishould return the result in json format.
   
   ● Inthe absence of any training centers, we need to return an empty list in response.