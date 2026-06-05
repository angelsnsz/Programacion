package ExamenTema7;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PeonadaDAO {

    private static final String URL = "jdbc:mysql://localhost:3306/ayuntamiento_db";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public Connection conectar() throws SQLException {

        return DriverManager.getConnection(
                URL,
                USER,
                PASSWORD
        );
    }

    public void insertarPeonadas(
            List<Peonada> lista) {

        String borrar =
                "DELETE FROM Peonadas";

        String insertar =
                """
                INSERT INTO Peonadas
                (fecha,nombre_empleado,parque,horas)
                VALUES (?,?,?,?)
                """;

        try (Connection con = conectar()) {

            con.setAutoCommit(false);

            try {

                try (Statement st =
                             con.createStatement()) {

                    st.executeUpdate(borrar);
                }

                try (PreparedStatement ps =
                             con.prepareStatement(insertar)) {

                    for (Peonada p : lista) {

                        ps.setObject(
                                1,
                                p.getFecha());

                        ps.setString(
                                2,
                                p.getNombreEmpleado());

                        ps.setString(
                                3,
                                p.getParque());

                        ps.setInt(
                                4,
                                p.getHoras());

                        ps.executeUpdate();
                    }
                }

                con.commit();

                System.out.println("Insertados " + lista.size() + " registros.");

            } catch (SQLException e) {

                con.rollback();

                System.out.println("Rollback realizado. " + lista.size() + " registros intentados.");
            }

        } catch (SQLException e) {
            System.out.println("Error conexión BD: " + e.getMessage());
        }
    }

    public List<ResumenEmpleado> obtenerResumen() {

        List<ResumenEmpleado> lista = new ArrayList<>();

        String sql =
                """
                SELECT nombre_empleado,
                       COUNT(*) AS jornadas,
                       SUM(horas) AS total_horas
                FROM Peonadas
                GROUP BY nombre_empleado
                ORDER BY total_horas DESC
                """;

        try (
                Connection con = conectar();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql)
        ) {

            while (rs.next()) {
                lista.add(
                        new ResumenEmpleado(
                                rs.getString("nombre_empleado"),
                                rs.getInt("jornadas"),
                                rs.getInt("total_horas")
                        )
                );
            }

        } catch (SQLException e) {

            System.out.println(e.getMessage());
        }

        return lista;
    }
}
