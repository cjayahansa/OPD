import React, {useState, useEffect} from "react";

const Api = () => {
    const [id, setId] = useState("1");
    const [data, setData] = useState("");
    useEffect(() => {
        console.log("use effect run");
        const apicall = async () => {
            console.log("apicall rn");
            const response = await fetch(`http://localhost:8080/pdata/${id}`);
            const result = await response.text();
            setData(result); // Store the response in state
            console.log("API response:", result);
        };

        apicall();
    }, [id]);

    return (
        <div>
            <h1>API call</h1>
            <p>id: {id}</p>
            <p>Response: {data}</p>
            <button onClick={() => setId("2")}>Change ID</button>
            <button onClick={() => setId("3")}>Change ID</button>
            <button onClick={() => setId("78")}>Change ID</button>
        </div>
    );
};
//http://localhost:8080/pdata/34
export default Api;
