const express = require("express");

const app =  express();

app.use(express.json());

const valid_star_names = [
    {name:'Beta Sagiti'},
    {name: "Alpha Sirius"}
]


const details =[{type:"Yellow Dwarf",temperature:"5000"},{type:"Red Giant",temperature:"4000"},{type:"Blue Giant",temperature:"25000"},{type:"White Dwarf",temperature:"50000"}]



app.get('/api/star/details/:type', (request,response) =>{
    const type = details.find(c => c.type === request.params.type);
    if(!type) response.status(404).send({Error:"That is not a valid star type"});
    response.send(type)
});


//creating an endpoint with filtered results
app.get("/api/names/filter",(request,response)=>{
    //returns all id values less than the request id value
    //you can use the
    const idnum = names.filter(c => c.id < parseInt(request.body.id));
    //this value is based on results if the request has an id of 1 when there
    //are three entries , idnum is still zero
    if(idnum==0){
    response.status(404).send("There is no ID less than the value provided")
        return
    }
    response.send(idnum)

});
//find exactID Value
app.get("/api/names/exact",(request,response)=>{
    //returns all id values less than the request id value
    //you can use the
    const idnum = names.find(c => c.id === parseInt(request.body.id));
    //this value is based on results if the request has an id of 1 when there
    //are three entries , idnum is still zero
    if(idnum==null){
    response.status(404).send("There is no ID less than the value provided")
        return
    }
    response.send(idnum)

});



//better than if when using structure compared to using ifs
app.get('/api/names/:prefix', (request,response) =>{
   const nameprefix = names.find(c => c.name === request.params.prefix);
   if(!nameprefix) response.status(404).send("That is not a valid star name");
   response.send(nameprefix);
});

app.post('/api/names', (request,response) =>{

    if(!request.body.name || request.body.name.length < 4){
        //four is inclusive
        response.status(400).send("The requested star name is invalid ")
        return
        //stop the execution of the rest of the program
    }
    const name={
 id: names.length+1,
 name: request.body.name
    }
    names.push(name);
    response.send(name)
});

app.get('/api/names', (request,response) =>{
    response.send(valid_star_names);
});

app.put('/api/names', (request,response) =>{
    const nameprefix = names.find(c => c.id === parseInt(request.body.id));
    if(!nameprefix) response.status(404).send("That is not a valid star name");

    nameprefix.name = request.body.name;
    response.send(names);
    print(request)
 });

//Post-create
//get-read
//put-update
//Delete=delete
 function print(text){
    console.log(text)
 }



//use this for dynamic ports
const port = process.env.PORT || 3000;
app.listen(port, ()=> console.log('listening on port '+port));
