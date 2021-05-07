import Dashboard from 'components/pages/Dashboard';
import Home from 'components/pages/Home';
import {BrowserRouter, Route, Switch} from 'react-router-dom';

const Routes = () => {
    return (
        <BrowserRouter>
            <Switch>
                <Route path="/" exact>
                    <Home/>
                </Route>

                <Route path="/dashboard">
                    <Dashboard/>
                </Route>

            </Switch>
        </BrowserRouter>
    );
}

export default Routes;