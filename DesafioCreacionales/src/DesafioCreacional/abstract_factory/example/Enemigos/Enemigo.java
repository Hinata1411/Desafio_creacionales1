//Interfaz Enemigo con métodos atacar y recibir daño
package DesafioCreacional.abstract_factory.example.Enemigos;
public interface Enemigo {
    void atacar();
    void recibirDanio(int danio);

    int getVida();

}
