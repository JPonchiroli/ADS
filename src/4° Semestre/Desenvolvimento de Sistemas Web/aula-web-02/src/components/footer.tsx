export default function Footer() {

    const data = new Date();
    const year = data.getFullYear();

  return (
    <footer className="bg-gray-900 text-white text-center p-5">
        <p className="text-lg">&copy; Todos direitos reservados</p>
        <p className="text-sm">Unisenai {year}</p>
    </footer>
  );
}   
