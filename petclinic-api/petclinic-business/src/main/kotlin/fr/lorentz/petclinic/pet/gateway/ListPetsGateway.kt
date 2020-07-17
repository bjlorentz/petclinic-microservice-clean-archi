package fr.lorentz.petclinic.pet.gateway

import fr.lorentz.petclinic.pet.entity.Pet

interface ListPetsGateway {
    fun listPets() : List<Pet>
}