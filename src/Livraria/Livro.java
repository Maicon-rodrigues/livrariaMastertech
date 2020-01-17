package Livraria;

public class Livro {

    private static Livro Autor;
    private String titulo;
        private int totalPaginas;
        private String aberto;
        private String genero;
        private String autor;
        private String editora;
        private int paginaAtual;
        private int anoPublicado;

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public int getTotalPaginas() {
            return totalPaginas;
        }

        public void setTotalPaginas(int totalPaginas) {
            this.totalPaginas = totalPaginas;
        }

        public String isAberto(String aberto) {
            return aberto;
        }

        public void setAberto(String aberto) {
            this.aberto = aberto;
        }

        public String getGenero() {
            return genero;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        public String getEditora() {
            return editora;
        }

        public void setEditora(String editora) {
            this.editora = editora;
        }

        public int getPaginaAtual() {
            return paginaAtual;
        }

        public void setPaginaAtual(int paginaAtual) {
            this.paginaAtual = paginaAtual;
        }

        public int getAnoPublicado() {
            return anoPublicado;
        }

        public void setAnoPublicado(int anoPublicado) {
            this.anoPublicado = anoPublicado;
        }

    public Livro(String titulo, int totalPaginas, String aberto, String genero, String autor, String editora, int paginaAtual, int anoPublicado) {
        this.titulo = titulo;
        this.totalPaginas = totalPaginas;
        this.aberto = aberto;
        this.genero = genero;
        this.autor = autor;
        this.editora = editora;
        this.paginaAtual = paginaAtual;
        this.anoPublicado = anoPublicado;
    }


    public String retornarDadosLivro() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", totalPaginas=" + totalPaginas +
                ", aberto='" + aberto + '\'' +
                ", genero='" + genero + '\'' +
                ", autor='" + autor + '\'' +
                ", editora='" + editora + '\'' +
                ", paginaAtual=" + paginaAtual +
                ", anoPublicado=" + anoPublicado +
                '}';
    }

    public boolean verifivarLivroAberto (String aberto){
            if (aberto == aberto){
                return true;
            }
            else {
                return false;
            }
    }

}



