import "bootstrap/dist/css/bootstrap.css";
import "antd/dist/antd.min.css";
import "./App.css";
import { Route, Routes } from "react-router-dom";
import Login from "./pages/Login";
import Register from "./pages/Register";
import Home from "./pages/Home";
import Writing from "./pages/Writing";
import CreateBoardComponent from "./pages/CreateBoard";

function App() {
  return (
    <Routes>
      <Route path="/" element={<Home />} />
      <Route path="/login" element={<Login />} />
      <Route path="/register" element={<Register />} />
      <Route path="/writing" element={<Writing />}></Route>
      <Route path="/createboard" element={<CreateBoardComponent />} />
    </Routes>
  );
}

export default App;
