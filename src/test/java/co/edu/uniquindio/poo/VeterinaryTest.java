/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

/**
 * Clase de pruebas para verificar funcionamiento de Student
 */
public class VeterinaryTest {
    private static final Logger LOG = Logger.getLogger(VeterinaryTest.class.getName());

    /**
     * Prueba para verificar que los datos de la mascota esten completos
     */
    @Test
    public void completeData() {
        LOG.info("Start completeData");
        Veterinary veterinary = new Veterinary("Amigos Peludos", null );
        assertEquals("Amigos Peludos", veterinary.getName());
        assertEquals(new ArrayList<Pet>(), veterinary.getPetList());
        LOG.info("Ending completeData");
    }

    /**
     * Prueba para verificar que los datos de la mascota no esten nulos
     */
    @Test
    public void nullData() {
        LOG.info("Start nullData");
        assertThrows(Throwable.class, () -> new Veterinary(null, null));
        LOG.info("Ending nullData");
    }
    /*
     * Prueba para verificar que la edad de la mascota no sea negativa 
     */
    @Test
    public void addPet(){
        LOG.info("Start addPet");

        var veterinary = new Veterinary("Amigos Peludos",null);
        var pet = new Pet("sachy",SpeciesEnum.DOG,BreedEnum.ROTTWEILER,(byte) 2,GenderEnum.FEMALE,25.55,ColorEnum.WHITE,1L);

        veterinary.addPet(pet);

        assertTrue(veterinary.getPetList().contains(pet));
        assertEquals(1, veterinary.getPetList().size());
        LOG.info("Ending addPet");

    }
     /**
     * Prueba para verificar que el programa no permite agregar dos mascotas con el mismo id
     */
    @Test
    public void addRepeatStudent() {
        LOG.info("Start add repeat student");

        var veterinary = new Veterinary("Amigos Peludos",null);
        var pet = new Pet("sachy",SpeciesEnum.DOG,BreedEnum.ROTTWEILER,(byte) 2,GenderEnum.FEMALE,25.55,ColorEnum.WHITE,1L);

        veterinary.addPet(pet);

        assertThrows(Throwable.class, () -> veterinary.addPet(pet));

        LOG.info("Ending add repeat student");
    }

    /**
     * Prueba para verificar el obtener un listado  de mascotas alfabetico 
     */
    @Test
    public void getAlphabeticalList() {
        LOG.info("Start  get Alphabetical List ");

        var veterinary = new Veterinary("Amigos Peludos",null);

        var panchita = new Pet("panchita",SpeciesEnum.CAT,BreedEnum.SIAMES,(byte) 2,GenderEnum.FEMALE,11.11,ColorEnum.WHITE,1L);
        var kira = new Pet("kira",SpeciesEnum.DOG,BreedEnum.ROTTWEILER,(byte) 3,GenderEnum.FEMALE,51.11,ColorEnum.BLACK,2L);
        var pancrasia = new Pet("pancrasia",SpeciesEnum.CAT,BreedEnum.PERSA,(byte) 1,GenderEnum.FEMALE,21.11,ColorEnum.GRAY,3L);
        var beto = new Pet("beto",SpeciesEnum.CAT,BreedEnum.SIAMES,(byte) 7,GenderEnum.MALE,2.11,ColorEnum.BROWN,4L);

        veterinary.addPet(panchita);
        veterinary.addPet(kira);
        veterinary.addPet(pancrasia);
        veterinary.addPet(beto);
        Collection<Pet> listaEsperada = List.of(beto,kira, panchita, pancrasia);

        assertIterableEquals(listaEsperada, veterinary.getAlphabeticalList());

        LOG.info("Ending  get Alphabetical List");
    }
    /**
     * Prueba para verificar el obtener un listado  de mascotas alfabetico 
     */
    @Test
    public void getListByDescendingAge() {
        LOG.info("Start  get list by descending age");

        var veterinary = new Veterinary("Amigos Peludos",null);

        var panchita = new Pet("panchita",SpeciesEnum.CAT,BreedEnum.SIAMES,(byte) 7,GenderEnum.FEMALE,11.11,ColorEnum.WHITE,1L);
        var kira = new Pet("kira",SpeciesEnum.DOG,BreedEnum.ROTTWEILER,(byte) 6,GenderEnum.FEMALE,51.11,ColorEnum.BLACK,2L);
        var pancrasia = new Pet("pancrasia",SpeciesEnum.CAT,BreedEnum.PERSA,(byte) 5,GenderEnum.FEMALE,21.11,ColorEnum.GRAY,3L);
        var beto = new Pet("beto",SpeciesEnum.CAT,BreedEnum.SIAMES,(byte) 4,GenderEnum.MALE,2.11,ColorEnum.BROWN,4L);

        veterinary.addPet(panchita);
        veterinary.addPet(kira);
        veterinary.addPet(pancrasia);
        veterinary.addPet(beto);
        Collection<Pet> listaEsperada = List.of(panchita,kira, pancrasia,beto);

        assertIterableEquals(listaEsperada, veterinary.getListByDescendingAge());

        LOG.info("Start  get list by descending age");
    }

    /**
     * Prueba para verificar el obtener un listado  de mascotas alfabetico 
     */
    @Test
    public void getAdultPetList() {
        LOG.info("Start  get Adult pet list");

        var veterinary = new Veterinary("Amigos Peludos",null);

        var panchita = new Pet("panchita",SpeciesEnum.CAT,BreedEnum.SIAMES,(byte) 7,GenderEnum.FEMALE,11.11,ColorEnum.WHITE,1L);
        var kira = new Pet("kira",SpeciesEnum.DOG,BreedEnum.ROTTWEILER,(byte) 6,GenderEnum.FEMALE,51.11,ColorEnum.BLACK,2L);
        var pancrasia = new Pet("pancrasia",SpeciesEnum.CAT,BreedEnum.PERSA,(byte) 1,GenderEnum.FEMALE,21.11,ColorEnum.GRAY,3L);
        var beto = new Pet("beto",SpeciesEnum.CAT,BreedEnum.SIAMES,(byte) 1,GenderEnum.MALE,2.11,ColorEnum.BROWN,4L);

        veterinary.addPet(panchita);
        veterinary.addPet(kira);
        veterinary.addPet(pancrasia);
        veterinary.addPet(beto);
        Collection<Pet> listaEsperada = List.of(panchita,kira);

        assertIterableEquals(listaEsperada, veterinary.getAdultPetList());

        LOG.info("Start  get Adult pet list");
    }



    /*
     * Prueba para verificar que la edad de la mascota no sea negativa 
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
            new Pet("sachy", SpeciesEnum.DOG, BreedEnum.ROTTWEILER, (byte)-9, GenderEnum.FEMALE,90.32, ColorEnum.WHITE, 1L);

    }
}
}