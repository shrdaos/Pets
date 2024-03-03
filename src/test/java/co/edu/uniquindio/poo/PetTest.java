/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

/**
 * Clase de pruebas para verificar funcionamiento de Student
 */
public class PetTest {
    private static final Logger LOG = Logger.getLogger(PetTest.class.getName());

    /**
     * Prueba para verificar que los datos de la mascota esten completos
     */
    @Test
    public void completeData() {
        LOG.info("Start completeData");
        Pet pet = new Pet("sachy", SpeciesEnum.PERRO, BreedEnum.ROTTWEILER, (byte)9, GenderEnum.HEMBRA,90.32, ColorEnum.BLANCO);

        assertEquals("sachy", pet.getName());
        assertEquals(SpeciesEnum.PERRO, pet.getSpecies());
        assertEquals(BreedEnum.ROTTWEILER, pet.getBreed());
        assertEquals((byte)9, pet.getAge());
        assertEquals(GenderEnum.HEMBRA, pet.getGender());
        assertEquals(90.32, pet.getWeight());
        assertEquals(ColorEnum.BLANCO, pet.getColor());
        LOG.info("Ending completeData");
    }

    /**
     * Prueba para verificar que los datos del estudiante no esten nulos
     */
    @Test
    public void nullData() {
        LOG.info("Start nullData");
        assertThrows(Throwable.class, () -> new Pet(null, null, null, (byte) 0, null, 0, null));
        LOG.info("Ending nullData");
    }
    
    /*
     * Prueba para verificar que el correo del estudiante este correcto
     */
    @Test
    public void negativeAge() {
        LOG.info("Start negativeAge");
         NegativeAgeTester tester= new NegativeAgeTester();
         assertThrows(Throwable.class, tester);
        LOG.info("Ending emptyData");

    }
    private static class NegativeAgeTester implements Executable{
        @Override
        public void execute() throws Throwable {
            new Pet("sachy", SpeciesEnum.PERRO, BreedEnum.ROTTWEILER, (byte)-9, GenderEnum.HEMBRA,90.32, ColorEnum.BLANCO);

    }
}
}
