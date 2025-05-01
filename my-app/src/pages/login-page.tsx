const LoginPage = () => {
    return (
        <div>
            <h2>Login</h2>
            <button onClick={() => window.location.href = '/login'}>Login with Google</button>
        </div>
    );
};

export default LoginPage;
