import React from "react";
import {Input} from "reactstrap";

class Word extends React.Component {
    render(){
        return (
            <div className="GuessSection">
                <h style={{color:"white"}}>Current Guess</h>
                <Input className="InputLetter" onChange={(e)=>this.props.callback(e)} />
            </div>
        )
    }
}

export default Word
