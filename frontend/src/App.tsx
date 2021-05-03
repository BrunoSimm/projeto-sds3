import DataTable from "components/DataTable";
import Footer from "components/Footer";
import NavBar from "components/NavBar";
//Componente que será o principal para renderizar no index.tsx
function App() {
  return (
    <>
      <NavBar />

      <div className='container'>
        {/*"className" = JSX. Html = "class"*/}
        <DataTable/>
      </div>

      <Footer/>
    </>
  );
}

export default App;
