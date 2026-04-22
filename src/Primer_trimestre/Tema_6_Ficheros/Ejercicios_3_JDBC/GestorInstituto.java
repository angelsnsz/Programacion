package Primer_trimestre.Tema_6_Ficheros.Ejercicios_3_JDBC;

import java.sql.*;

public class GestorInstituto {

    private static final String URL = "jdbc:mysql://localhost:3306/instituto_db";
    private static final String USUARIO = "root";
    private static final String PASSWORD = ""; // Que cada alumno ponga la suya
    private static Connection conexion;

    // TODO Paso 1: Crear el método conectar() y desconectar()
    // Mantenemos una única conexión en toda la aplicación

    // TODO Paso 2: Crear el método registrarAlumno(String nombre, String email)
    // Alta de un alumno en su tabla correspondiente

    // TODO Paso 3: Crear el método matricularAlumno(int idAlumno, int idAsignatura)
    // Aquí estamos insertando una relación N:N

    // TODO Paso 4: Crear el método mostrarAsignaturasDeAlumno(int idAlumno)
    // Select con join...

    // TODO Paso 5: Crear el método darDeBajaAlumno(int idAlumno)
    // Delete...

    public static void main(String[] args) {
        GestorInstituto gestor = new GestorInstituto();
        // Aquí iremos probando los métodos paso a paso
        conectar();
        System.out.println("Estamos conectados a la base de datos");


        desconectar();
    }
    public static void conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USUARIO, PASSWORD);
        }catch (ClassNotFoundException e){
            System.err.println("No se ha encontrado el driver de MySQL");
        }catch (SQLException ex){
            System.err.println("Error de SQL al conectar :: " + e.getMessage());
        }
    }
    public static  void desconectar(){
        try{
            conexion.close();
        }catch (SQLException e) {
            System.err.println("Error de SQL al desconectar :: " + e.getMessage());
        }
    }
    public static void mostrarAlumnos(){
        try{
            Statement stmt= conexion.createStatement();

        }
    }
    public static void registrarAlumno(String nombre, String email) throws SQLException{
        try {
            PreparedStatement statement= conexion.prepareStatement("INSERT INTO Alumnos(nombre,email) VALUES (?,?)");
            statement.setString(1,nombre);
            statement.setString(2, email);
            int filas= statement.executeUpdate();
        }catch (SQLException e){
            System.err.println("Error al insertar un alumno :: " + e.getMessage());
            throw e;
        }
    }
    public static void matricularAlumno(int idAlumno, int idAsignatura){


    }
}
