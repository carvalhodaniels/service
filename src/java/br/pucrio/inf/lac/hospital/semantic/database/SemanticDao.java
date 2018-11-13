package br.pucrio.inf.lac.hospital.semantic.database;

import br.pucrio.inf.lac.hospital.semantic.data.Beacon;
import br.pucrio.inf.lac.hospital.semantic.data.Building;
import br.pucrio.inf.lac.hospital.semantic.data.City;
import br.pucrio.inf.lac.hospital.semantic.data.Device;
import br.pucrio.inf.lac.hospital.semantic.data.HasA;
import br.pucrio.inf.lac.hospital.semantic.data.MHub;
import br.pucrio.inf.lac.hospital.semantic.data.Person;
import br.pucrio.inf.lac.hospital.semantic.data.Room;
import br.pucrio.inf.lac.hospital.semantic.data.Section;
import java.util.Set;
import java.util.UUID;

public interface SemanticDao {
    /**
     * Insert Object
     * the only parameter is the object to be inserted
     * returns the id generated by the database or -1 in case of error
     */
    public long insertBeacon(Beacon b);
    public long insertBuilding(Building b);
    public long insertCity(City c);
    public long insertDevice(Device d);
    public long insertHasA(HasA h);
    public long insertMHub(MHub m);
    public long insertPerson(Person p);
    public long insertRoom(Room r);
    public long insertSection(Section s);
    
    /**
     * Delete Object
     * the only parameter is the id of the object to be deleted
     * returns true if the object has been deleted or false if it has not
     */
    public boolean deleteBeacon(UUID thingID);
    public boolean deleteBuilding(long buildingID);
    public boolean deleteCity(long cityID);
    public boolean deleteDevice(long deviceID);
    public boolean deleteHasA(long hasAID);
    public boolean deleteMHub(UUID mhubID);
    public boolean deletePerson(long personID);
    public boolean deleteRoom(long roomID);
    public boolean deleteSection(long sectionID);
    
    /**
     * Update Object
     * the only parameter is the object to be updated
     * the object's id must be the one to be updated on the database
     * returns true if the object has been updated or false if it has not
     */
    public boolean updateBeacon(Beacon b);
    public boolean updateBuilding(Building b);
    public boolean updateCity(City c);
    public boolean updateDevice(Device d);
    public boolean updateHasA(HasA h);
    //public boolean updateMHub(MHub m);
    public boolean updatePerson(Person p);
    public boolean updateRoom(Room r);
    public boolean updateSection(Section s);
    
    /**
     * Get Objects
     * no parameters
     * returns a Set all the objects of one type stored at the database
     */
    public Set<Beacon> getBeacons();
    public Set<Building> getBuildings();
    public Set<City> getCities();
    public Set<Device> getDevices();
    public Set<HasA> getHasAs();
    public Set<MHub> getMHubs();
    public Set<Person> getPersons();
    public Set<Room> getRooms();
    public Set<Section> getSections();
    
    /**
     * Specific Gets
     * Gets a Specific Set of Objects based on the parameters
     */
    /**
     * Gets a specific Room
     * @param room the name of the Room
     * @return the Room
     */
    public Room getRoom(String room);
    
    /**
     * Gets all the HasA (Devices+Persons+Rooms) located at a specific Room
     * @param roomID the id of the Room
     * @return A Set of HasA containing the Devices, Persons and Rooms
     */
    public Set<HasA> getHasAByRoom(long roomID);
    
    /**
     * Gets a specific HasA (Devices+Persons+Rooms) with a specific Device
     * @param deviceID the id of the Device
     * @return the HasA containing the Devices, Persons and Rooms
     */
    public HasA getHasAByDevice(long deviceID);
    
    /**
     * Gets all the specific HasA (Devices+Persons+Rooms) with a specific Person
     * @param personID the id of the Person
     * @return A Set of HasA containing the Devices, Persons and Rooms
     */
    public Set<HasA> getHasAByPerson(long personID);
    
    /**
     * Gets a specific Device
     * @param deviceID the id of the Device
     * @return the Device
     */
    public Device getDevice(long deviceID);
    
    /**
     * Gets a specific Device
     * @param mhubID the id of the MHub
     * @return the Device
     */
    public Device getDeviceByMHub(UUID mhubID);
    
    /**
     * Gets a specific Device
     * @param thingID the id of the MHub
     * @return the Device
     */
    public Device getDeviceByThing(UUID thingID);
    
    /**
     * Gets a specific Beacon
     * @param thingID the id of the Beacon
     * @return the Beacon
     */
    public Beacon getBeacon(UUID thingID);
    
    /**
     * Gets a specific MHub
     * @param mhubID the id of the MHub
     * @return the MHub
     */
    public MHub getMHub(UUID mhubID);
    
    /**
     * Gets a specific Person
     * @param personID the id of the Person
     * @return the Person
     */
    public Person getPerson(long personID);
    
    /**
     * Gets a specific Person
     * @param personEmail the email of the Person
     * @return the Person
     */
    public Person getPersonByEmail(String personEmail);
    
}



