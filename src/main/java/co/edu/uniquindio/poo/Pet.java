package co.edu.uniquindio.poo;
public class Pet {
    private String name;
    private SpeciesEnum species;
    private BreedEnum breed;
    private byte age;
    private GenderEnum gender;
    private double weight;
    private ColorEnum color;
    public Pet(String name, SpeciesEnum species, BreedEnum breed, byte age, GenderEnum gender, double weight,
            ColorEnum color) {

        assert name != null && !name.isBlank() : "el nombre debe ser diferente de null";
        assert species != null : "la especie debe ser diferente de null";
        assert breed != null : "la raza debe ser deferente de null";
        assert gender != null  : "el ge'nero debe ser deferente de null";
        assert color != null:"el color no puede ser null";
        assert age > 0 : " la edad debe ser mayor a cero";
        assert weight > 0 : " el peso debe ser mayor a cero";

        this.name = name;
        this.species = species;
        this.breed = breed;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.color = color;
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
    @Override
    public String toString() {
        return "Pet [name=" + name + ", species=" + species + ", breed=" + breed + ", age=" + age + ", gender=" + gender
                + ", weight=" + weight + ", color=" + color + "]";
    } 


    

    /* 
    public Student( String name, String lastName, String identification, String email, String telephone, byte age){

        assert name != null && !name.isBlank() : "el nombre debe ser diferente de null";
        assert lastName != null && !lastName.isBlank(): "el apellido debe ser diferente de null";
        assert identification != null && !identification.isBlank(): "el numero de identificación debe ser deferente de null";
        assert email != null && email.contains("@") : " el correo debe contener el simbolo @";
        assert telephone != null:"el telefono no puede ser null";
        assert age > 0 : " la edad debe ser mayor a cero";

        this.identification = identification;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.telephone = telephone;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setlastName(String lastName) {
        this.lastName = lastName;
    }
    public String getIdentification() {
        return identification;
    }
    public void setidentification(String identification) {
        this.identification = identification;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public byte getAge() {
        return age;
    }
    public void setAge(byte age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Students{"+"name='"+ name +'\''+
        ", lastname='" +lastName + '\'' +
        ", identification='" +identification + '\'' +
        ", email='" +email + '\'' +
        ", telephone='" +telephone + '\'' +
        ", age=" + age +
        '}';
        
}
 */   
}
