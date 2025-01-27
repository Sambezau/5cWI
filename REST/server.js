const express = require('express');
const bodyParser = require('body-parser');
const cors = require('cors');

const app = express();
const port = 3000;




let people = [
    {
        id: 1,
        firstName: "Juli",
        lastName: "Deroja",
        age: "19"
    }
];

// Middleware
app.use(cors());
app.use(bodyParser.urlencoded({ extended: false }));
app.use(bodyParser.json());

// POST: Add a person
app.post('/person', (req, res) => {
    const person = {
        id: req.body.id,  
        firstName: req.body.firstName,
        lastName: req.body.lastName,
        age: req.body.age
    };
    people.push(person);
    res.json({
        message: 'Person wurde erfolgreich zur Datenbank hinzugefügt',
        person: person
    });
});

// GET: Retrieve all people
app.get('/person', (req, res) => {
    res.json(people);
});

// DELETE: Remove a person by ID
app.delete('/person/:id', (req, res) => {
    const id = parseInt(req.params.id);
    const index = people.findIndex(person => person.id === id);
    
    if (index !== -1) {
        people.splice(index, 1);
        res.send(`Person mit ID ${id} wurde erfolgreich gelöscht`);
    } else {
        res.status(404).send(`Person mit ID ${id} wurde nicht gefunden`);
    }
});

// PUT: Update a person by ID
app.put('/person/:id', (req, res) => {
    const id = parseInt(req.params.id);
    const index = people.findIndex(person => person.id === id);
    
    if (index !== -1) {
        
        const updatedPerson = {
            id: id, 
            firstName: req.body.firstName,
            lastName: req.body.lastName,
            age: req.body.age
        };
        
        people[index] = updatedPerson;
        res.json({
            message: `Person mit ID ${id} wurde erfolgreich aktualisiert`,
            person: updatedPerson
        });
    } else {
        res.status(404).send(`Person mit ID ${id} wurde nicht gefunden`);
    }
});

// Start the server
app.listen(port, () => console.log(`Server is running on http://localhost:${port}`));
