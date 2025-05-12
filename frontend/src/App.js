import React, { useState, useEffect } from 'react';
import axios from 'axios';

function App() {
  const [todos, setTodos] = useState([]);
  const [task, setTask] = useState('');

  const API_URL = 'http://35.209.83.253:8080/api/todos';

  // ... [rest of the React code from previous answer] ...
}

export default App;
