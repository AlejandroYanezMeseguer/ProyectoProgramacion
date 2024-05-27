package API.data;

/**
 * Clase data que contiene los atributos de armas y escudos para la implementación de la API
 */
public class Data {
        public String id;
        public String image;
        public String name;
        public String description;
        public Attack[] attack;
        public Defence[] defence;
        public scalesWith[] scalesWith;
        public requiredAttributes[] requiredAttributes;
        public String category;
        public int weight;
}
