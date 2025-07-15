package pOO.controlJuegos;

public class Main {
    public static void main(String[] args) {
        ColeccionJuegos coleccion = new ColeccionJuegos();
    }
    //Creación de juegos
    Juego juego1 = new Juego("The Legend of Zelda", "Nintendo Switch", 2017, "Nintendo");

    Juego juego2 = new Juego("God of War", "PlayStation 4", 2018, "Santa Monica Studio");

    Juego juego3 = new Juego("Donkey Kong Land", "Game Boy", 1995, "Rare");

    Juego juego4 = new Juego("Wave Race", "Nintendo 64", 1997, "Nintendo");

    Juego juego5 = new Juego("Metroid Prime", "Nintendo Game Cube", 2002, "Nintendo");

    Juego juego6 = new Juego("Super Mario World", "Super Nintendo", 1991, "Nintendo");
}
