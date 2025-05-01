import { useUser } from "./context/user-context";
import LoginPage from "./pages/login-page";
import Dashboard from "./pages/dashboard";

const App = () => {
  const { user } = useUser();

  return user ? <Dashboard /> : <LoginPage />;
};

export default App;
