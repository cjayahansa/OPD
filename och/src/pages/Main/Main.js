import React from "react";
import {useState, useEffect} from "react";

const Main = () => {
    const [pname, setpname] = useState("");
    const [pNIC, setpNIC] = useState("");
    const [page, setpage] = useState("");
    const [pemail, setpemail] = useState("");
    const [pdata, setpdata] = useState([]);
    // console.log(pdata);
    useEffect(() => {
        console.log("Updated pdata:", pdata);
    }, [pdata]);
    //uaeeffect eka run wenne eke adala eka wenas unama withari

    return (
        <div>
            <h1>OPD Booking service</h1>
            <form>
                <p>
                    Name:{"  "}
                    <input
                        type="text"
                        placeholder="type your name"
                        value={pname}
                        onChange={(e) => {
                            e.preventDefault();
                            setpname(e.target.value);
                        }}
                    />
                </p>
                <p>
                    NIC:{"  "}
                    <input
                        type="text"
                        placeholder="type your NIC num"
                        value={pNIC}
                        onChange={(e) => {
                            e.preventDefault();
                            setpNIC(e.target.value);
                        }}
                    />
                </p>
                <p>
                    age:{"  "}
                    <input
                        type="text"
                        placeholder="type your age"
                        value={page}
                        onChange={(e) => {
                            e.preventDefault();
                            setpage(e.target.value);
                        }}
                    />
                </p>
                <p>
                    email:{"  "}
                    <input
                        type="text"
                        placeholder="type your email"
                        value={pemail}
                        onChange={(e) => {
                            e.preventDefault();
                            setpemail(e.target.value);
                        }}
                    />
                </p>
                <button
                    onClick={(e) => {
                        e.preventDefault();
                        setpdata((pre) => {
                            return [
                                ...pre,
                                {
                                    pname: pname,
                                    pNIC: pNIC,
                                    page: page,
                                    pemail: pemail,
                                },
                            ];
                        });
                        setpname("");
                        setpNIC("");
                        setpage("");
                        setpemail("");
                    }}
                >
                    submit
                </button>

                <h2>name: {pname}</h2>
                <h2>NIC: {pNIC}</h2>
                <h2>age: {page}</h2>
                <h2>email: {pemail}</h2>
            </form>

            <div>
                <p>
                    {pdata?.map(({pname, pNIC, page, pemail}, index) => (
                        <div>
                            <h>name={pname}</h>
                            <br></br>
                            <h>NIC={pNIC}</h>
                            <br></br>
                            <h>age: {page}</h>
                            <br></br>
                            <h>email: {pemail}</h>
                        </div>
                    ))}
                </p>
            </div>
        </div>
    );
};

export default Main;
