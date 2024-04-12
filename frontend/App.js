import React, { useState, useEffect } from 'react';
import axios from 'axios';

function App() {
    const [question, setQuestion] = useState({});
    const [response, setResponse] = useState('');

    useEffect(() => {
        axios.get('/question').then(res => {
            setQuestion(res.data);
        });
    }, []);

    const handleSubmit = () => {
        axios.post('/response', {
            userId: 1, // assuming logged in user ID
            questionId: question.id,
            text: response,
        }).then(res => {
            alert('Response saved!');
        });
    };

    return (
        <div>
            <h1>{question.text}</h1>
            <textarea value={response} onChange={e => setResponse(e.target.value)} />
            <button onClick={handleSubmit}>Submit</button>
        </div>
    );
}

export default App;
