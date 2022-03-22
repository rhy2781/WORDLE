import React from "react";
import {Button} from "reactstrap";

class WordleKeyboard extends React.Component {
    render() {
        return (
            <div className="Keyboard">
                <div>
                    <Button className="Key">q</Button>
                    <Button className="Key">w</Button>
                    <Button className="Key">e</Button>
                    <Button className="Key">r</Button>
                    <Button className="Key">t</Button>
                    <Button className="Key">y</Button>
                    <Button className="Key">u</Button>
                    <Button className="Key">i</Button>
                    <Button className="Key">o</Button>
                    <Button className="Key">p</Button>
                </div>

                <div>
                    <Button className="Key">a</Button>
                    <Button className="Key">s</Button>
                    <Button className="Key">d</Button>
                    <Button className="Key">f</Button>
                    <Button className="Key">g</Button>
                    <Button className="Key">h</Button>
                    <Button className="Key">j</Button>
                    <Button className="Key">k</Button>
                    <Button className="Key">l</Button>
                </div>
                <div>
                    <Button className="Key">z</Button>
                    <Button className="Key">x</Button>
                    <Button className="Key">c</Button>
                    <Button className="Key">v</Button>
                    <Button className="Key">b</Button>
                    <Button className="Key">n</Button>
                    <Button className="Key">m</Button>
                </div>
            </div>
        )
    }
}

export default WordleKeyboard
