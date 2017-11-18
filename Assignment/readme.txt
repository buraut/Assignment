//GET
get all users : http://localhost:8080/SpringBootRestApi/api/user/   


//POST
Add new Users : http://localhost:8080/SpringBootRestApi/api/user/ 

request : 

     {
      
        "fName": "BBBBBBBBBBBBBB",
        "lName": "Raut",
        "email": "braut9919111@gmail.com",
        "pinCode": 411014,
        "birthDate": "1-5-1920"
    }
	
	
//PUT 	
Update User: 	http://localhost:8080/SpringBootRestApi/api/user/1
	
	{
        
       
        "pinCode": 411014,
        "birthDate": "1111-6-20"
    }
	
//DELETE

http://localhost:8080/SpringBootRestApi/api/user/1


1) DOB and EMail id  validation have been taken care 
2) i have used postmaster to test the same also have created one restTemplate class in case of UT

	