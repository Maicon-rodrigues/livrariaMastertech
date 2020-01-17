package Livraria;

public class LivrariaPaulista {
    public static void main (String[] args){

        Autor pessoa = new Autor(
                "Gustavo",
                "Cerbasi",
                "AutoAjuda",
                "Masculino",
                "Brasil",
                "Rio-Grande-do-Sul ",
                46

        );

        Editora loja = new Editora(
                "Sextante",
                1998,
                "40.933.512/0001-25",
                " R. Voluntários da Pátria, 45 - an 14 - Botafogo, Rio de Janeiro - RJ, 22270-900",
                "Brasil",
                "Rio-de-janeiro"
        );

        Livro produto = new Livro(
                "Casais inteligentes enriquecem juntos",
                176,
                "true",
                "AutoAjuda",
                "Gustavo",
                "Sextante",
                0,
                2014
        );

        System.out.println(Autor.retornarDadosAutor());
        System.out.println(Editora.retornarDadosEditora());
        System.out.println(produto.verifivarLivroAberto());
        System.out.println(produto.retornarDadosLivro());

    }

}
