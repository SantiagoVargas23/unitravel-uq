package co.edu.uniquindio.unitravel;


import co.edu.uniquindio.unitravel.entidades.Hotel;
import co.edu.uniquindio.unitravel.repositorios.HotelRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;
import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class HotelTest {

    @Autowired
    HotelRepo hotelRepo;

    @Test
    @Sql("classpath:dataset.sql")
    public void buscar(){
        Hotel hoteles = hotelRepo.findById(1).orElse(null);
        System.out.println(hoteles);
    }
    @Test
    @Sql("classpath:dataset.sql")
    public void buscarHoteles(){
        List<Hotel> hoteles = hotelRepo.obtenerHoteles(5);
        hoteles.forEach(System.out::println);
    }

    @Test
    @Sql("classpath:dataset.sql")
    public void listar(){
        List<Hotel> lista = hotelRepo.findAll();
        System.out.println(lista);
    }

}
