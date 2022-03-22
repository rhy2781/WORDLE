import logo from './logo.svg';
import './App.css';
import React from "react";
import WorldeKeyboard from "./components/WordleKeyboard";
import Word from "./components/Word";
import PossibleList from "./components/PossibleList";
import {Card} from "reactstrap";

class App extends React.Component{
    constructor(props) {
        super(props);
        this.state ={
            word:""
        }
    }
    change(temp){
        this.setState({word:temp});
    }
    render() {
        return (
            <div className="App">
                <Card> {this.state.word}</Card>
                <Word callback={(e) => this.change(e.target.value)}/>
                <PossibleList/>
                <WorldeKeyboard/>
            </div>
        );
    }
}

export default App;
