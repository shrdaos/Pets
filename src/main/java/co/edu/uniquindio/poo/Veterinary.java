package co.edu.uniquindio.poo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Veterinary {
    private String name;
    private ArrayList<Pet> petList;
    public Veterinary(String name, ArrayList<Pet> petList) {

        assert name != null && !name.isBlank() : "el nombre debe ser diferente de null";

        this.name = name;
        this.petList = petList != null? petList: new ArrayList<>() ;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Pet> getPetList() {
        return petList;
    }
    public void setPetList(ArrayList<Pet> petList) {
        this.petList = petList;
    }
    @Override
    public String toString() {
        return "Veterinary [name=" + name + ", petList=" + petList + "]";
    }
    /**
     * Método para agregar a una mascota a la veterinaria, validando que el 
     * numero de identificacion exista 
     * 
     * @param estudiante Estudiante que se desea agregar
     */
    public void addPet(Pet pet) {
        assert validateIdAvailability(pet.getId()) == false
                : "El número de identificación ya existe.";
        petList.add(pet);
    }
        /**
     * Método para obtener la colección NO modificable de las mascotas de la veterinaria 
     * en orden alfabético
     * 
     * @return la colección NO modificable de las mascotas del curso en orden
     *         alfabético
     */
    public Collection<Pet> getAlphabeticalList() {
        var comparator = Comparator.comparing(Pet::getName);
        var orderedPets = petList.stream().sorted(comparator).toList();
        return Collections.unmodifiableCollection(orderedPets);
    }
        /**
     * Método para obtener la colección NO modificable de las mascotas de la veterinaria 
     * en orden descendente segun la edad
     * 
     * @return la colección NO modificable de las mascotas de la veterinaria  en
     *         descendente por edad.
     */
    public Collection<Pet> getListByDescendingAge() {
        var comparator = Comparator.comparing(Pet::getAge).reversed();
        var orderedPets = petList.stream().sorted(comparator).toList();
        return Collections.unmodifiableCollection(orderedPets);
    }
    /**
     * Método para obtener la colección NO modificable de las mascotas de la veterinaria 
     * que son adultas (tienen almenos un anio cumplido) 
     * 
     * @return la colección NO modificable de las mascotas de la veterinaria  que son
     *         mayores de edad (tienen almenos un anio cumplido).
     */
    public Collection<Pet> getAdultPetList() {
        var adultPet = new LinkedList<Pet>();
        for (Pet pet : petList) {
            if (pet.getAge() > 1) {
                adultPet.add(pet);
            }
        }
        return Collections.unmodifiableCollection(adultPet);
    }

       /**
     * Método privado para determinar si ya existe un estudiante registro en el
     * mismo número de identificación
     * 
     * @param numeroIdentificacion Número de identificación a buscar
     * @return Valor boolean que indica si el número de identificación ya está o no
     *         registrado.
     */
    private boolean validateIdAvailability(Long petId) {
        boolean exists = false;

        for (Pet pet : petList) {
            if (pet.getId() == petId) {
                exists = true;
            }
        }
        return exists;
    }
}
