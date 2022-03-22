import React from "react";
import {Button} from "reactstrap";

class WordleKeyboard extends React.Component {
    render() {
        return (
            <div className="Keyboard">
                <div>
                    <Button className="key">q</Button>
                    <Button className="key">w</Button>
                    <Button className="key">e</Button>
                    <Button className="key">r</Button>
                    <Button className="key">t</Button>
                    <Button className="key">y</Button>
                    <Button className="key">u</Button>
                    <Button className="key">i</Button>
                    <Button className="key">o</Button>
                    <Button className="key">p</Button>
                </div>

                <div>
                    <Button className="key">a</Button>
                    <Button className="key">s</Button>
                    <Button className="key">d</Button>
                    <Button className="key">f</Button>
                    <Button className="key">g</Button>
                    <Button className="key">h</Button>
                    <Button className="key">j</Button>
                    <Button className="key">k</Button>
                    <Button className="key">l</Button>
                </div>
                <div>
                    <Button className="key">z</Button>
                    <Button className="key">x</Button>
                    <Button className="key">c</Button>
                    <Button className="key">v</Button>
                    <Button className="key">b</Button>
                    <Button className="key">n</Button>
                    <Button className="key">m</Button>
                </div>
            </div>
        )
    }
}

export default WordleKeyboard
