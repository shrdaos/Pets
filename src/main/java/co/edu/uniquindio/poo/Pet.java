package co.edu.uniquindio.poo;


public class Pet {
    private Long id; 
    private String name;
    private SpeciesEnum species;
    private BreedEnum breed;
    private byte age;
    private GenderEnum gender;
    private double weight;
    private ColorEnum color;

    public Pet(String name, SpeciesEnum species, BreedEnum breed, byte age, GenderEnum gender, double weight,
            ColorEnum color, Long id) {

        assert name != null && !name.isBlank() : "el nombre debe ser diferente de null";
        assert species != null : "la especie debe ser diferente de null";
        assert breed != null : "la raza debe ser deferente de null";
        assert gender != null  : "el ge'nero debe ser deferente de null";
        assert color != null:"el color no puede ser null";
        assert age > 0 : " la edad debe ser mayor a cero";
        assert weight > 0 : " el peso debe ser mayor a cero";
        assert id > 0 : "El id debe ser mayor que cero";

        this.name = name;
        this.species = species;
        this.breed = breed;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.color = color;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public SpeciesEnum getSpecies() {
        return species;
    }
    public void setSpecies(SpeciesEnum species) {
        this.species = species;
    }
    public BreedEnum getBreed() {
        return breed;
    }
    public void setBreed(BreedEnum breed) {
        this.breed = breed;
    }
    public byte getAge() {
        return age;
    }
    public void setAge(byte age) {
        this.age = age;
    }
    public GenderEnum getGender() {
        return gender;
    }
    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public ColorEnum getColor() {
        return color;
    }
    public void setColor(ColorEnum color) {
        this.color = color;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Pet [id=" + id + ", name=" + name + ", species=" + species + ", breed=" + breed + ", age=" + age
                + ", gender=" + gender + ", weight=" + weight + ", color=" + color + "]";
    } 
    
}
