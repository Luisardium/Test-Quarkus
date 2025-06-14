# API de Personas y Direcciones - Quarkus

Este proyecto implementa una API REST en Quarkus que permite gestionar personas y sus direcciones asociadas. Está basado en una relación **OneToMany** (una persona puede tener muchas direcciones).

## Estructura de la Relación

- Una **Persona** puede tener muchas **Direcciones**.
- Cada **Dirección** pertenece a **una sola Persona**.

---

## Endpoints disponibles

### 1. Crear Persona

- **Método:** `POST`
- **URL:** `http://localhost:8080/Person`
- **JSON Body (Ejemplo):**

```json
{
  "name": "Pedro"
}
```
### 2. Crear Direccion

- **Método:** `POST`
- **URL:** `http://localhost:8080/address`
- **JSON Body (Ejemplo):**
```json
{
  "zona": 11,
  "municipio": "Jalpatagua",
  "departamento": "Jutiapa",
  "person_id": 1
}
```
⚠️ El campo `person_id` debe ser el ID de una persona previamente creada.
### 3. Ver todas las direcciones

- **Método:** `GET`
- **URL:** `http://localhost:8080/address`
- **Respuesta JSON esperada:**
```json
[
  {
    "zona": 11,
    "municipio": "San Francisco",
    "departamento": "Jutiapa"
    "person_id": 1
  },
  {
    "zona": 5,
    "municipio": "Jalpatagua",
    "departamento": "Jutiapa"
    "person_id": 2
  }
]
```
### 4. Ver direcciones de una persona por ID

- **Método:** `GET`
- **URL:** `http://localhost:8080/address/{id}/address`
- **Respuesta JSON esperada:**
```json
[
    {
        "id": 1,
        "zona": 5,
        "municipio": "San Francisco",
        "departamento": "Jutiapa"
    },
    {
        "id": 2,
        "zona": 5,
        "municipio": "Jutiapa",
        "departamento": "Jutiapa"
    }
]
```
