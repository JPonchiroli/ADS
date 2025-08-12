import Footer from "./components/footer"
import Header from "./components/header"

function App() {

  return (
    <>
      <Header />
      <main>
        <div className='flex flex-col items-center p-8 bg-red-300 min-h-screen'>
          <h1 className="font-bold text-shadow-lg text-3xl">Bem-vindo REACT+VITE+TAILWINDCSS</h1>
          <p className="text-sm mt-10">Página web interativas e responsivas</p>

          <hr className="border-01 w-full"/>

          <p className="text-sm mt-10">Quer saber como funciona</p>
          <label className="border-2 border-black rounded-lg px-3 mt-2 bg-red-500 text-white">Clique aqui</label>
        </div>

      </main>
      <Footer />
    </>
  )
}

export default App
