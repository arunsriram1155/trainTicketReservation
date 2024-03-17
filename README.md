used online compiler for execution 

https://coderpad.io/languages/java/spring/

Post to book a ticket 

/ticket?from=London&to=France
{
    "firstName": "John",
    "lastName": "Doe",
    "email": "john.doe@example.com"
}
 
 output : 
  {
  "Price Paid": "20.0$",
  "User": {
    "email": "john.doe2@example.com",
    "seat": "A2",
    "fullName": "John Doe"
  },
  "From": "London",
  "To": "France"
}
---- 
 

invalid ticket 

POST : /ticket?from=London&to=Frances


GET : /users

output : 

{
  "john.doe@example.com": {
    "email": "john.doe@example.com",
    "seat": "A1",
    "fullName": "John Doe"
  },
  "john.doe2@example.com": {
    "email": "john.doe2@example.com",
    "seat": "A2",
    "fullName": "John Doe"
  }
}



/receipt/john.doe@example.com

get reponse  output 
 
{
  "Price Paid": "20.0$",
  "User": {
    "email": "john.doe@example.com",
    "seat": "A1",
    "fullName": "John Doe"
  },
  "From": "London",
  "To": "France"
}


PUT API /modify/john.doe@example.com?newSeat=b2

DELTE API /remove/john.doe2@example.com
OUTPUT : 
{
  "email": "john.doe@example.com",
  "seat": "b2",
  "fullName": "John Doe"
}

