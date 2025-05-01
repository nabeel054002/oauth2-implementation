import { useUser } from "../context/user-context";

const Dashboard = () => {
  const { user, logout } = useUser();

  if (!user) return <p>Not logged in</p>;

  return (
    <div style={{ padding: "2rem" }}>
      <h2>Welcome, {user.name}!</h2>
      <p>Email: {user.email}</p>
      <button onClick={logout}>Logout</button>
    </div>
  );
};

export default Dashboard;
