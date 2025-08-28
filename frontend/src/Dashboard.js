import React from "react";
import { useNavigate } from "react-router-dom";

export default function Dashboard() {
  const navigate = useNavigate();

  const handleLogout = () => {
    localStorage.removeItem("token");
    navigate("/login");
  };

  // Example list of apps
  const apps = [
    { name: "App1", link: "/app1" },
    { name: "App2", link: "/app2" },
    { name: "App3", link: "/app3" },
  ];

  return (
    <div className="container text-center mt-5">
      <h1>Welcome to Dashboard!</h1>

      <table className="table table-striped mt-4">
        <thead>
          <tr>
            <th>#</th>
            <th>Application Name</th>
            <th>Link</th>
          </tr>
        </thead>
        <tbody>
          {apps.map((app, index) => (
            <tr key={app.name}>
              <td>{index + 1}</td>
              <td>{app.name}</td>
              <td>
                <a href={app.link} className="btn btn-primary btn-sm">
                  Go to {app.name}
                </a>
              </td>
            </tr>
          ))}
        </tbody>
      </table>

      <button onClick={handleLogout} className="btn btn-danger mt-3">
        Logout
      </button>
    </div>
  );
}
