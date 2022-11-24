import React, { Component } from "react";
import BoardService from "../BoardService";
import { Link } from "react-router-dom";
import { Layout, Menu, Button } from "antd";
import { useNavigate } from "react-router-dom";
class ListBoard extends Component {
  constructor(props) {
    super(props);

    this.state = {
      boards: [],
    };

    this.createBoard = this.createBoard.bind(this);
  }

  componentDidMount() {
    BoardService.getBoards().then((res) => {
      this.setState({ boards: res.data });
    });
  }

  createBoard() {
    this.props.history.push("/create-board/");
  }
  render() {
    return (
      <div>
        <button type="button" class="btn btn-light" onClick={this.createBoard}>
          글작성
        </button>
        <h2 className="text-center">Boards List</h2>
        <div className="row">
          <table className="table table-striped table-bordered">
            <thead>
              <tr>
                <th>글 번호</th>
                <th>타이틀 </th>
                <th>작성자 </th>
                <th>작성일 </th>
                <th>갱신일 </th>
                <th>좋아요수</th>
                <th>조회수</th>
              </tr>
            </thead>
            <tbody>
              {this.state.boards.map((board) => (
                <tr key={board.no}>
                  <td> {board.no} </td>
                  <td> {board.title} </td>
                  <td> {board.memberNo} </td>
                  <td> {board.createdTime} </td>
                  <td> {board.updatedTime} </td>
                  <td> {board.likes} </td>
                  <td> {board.counts} </td>
                </tr>
              ))}
            </tbody>
          </table>
        </div>
      </div>
    );
  }
}

export default ListBoard;
