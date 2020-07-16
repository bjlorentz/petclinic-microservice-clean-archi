package fr.lorentz.petclinic.pet

import fr.lorentz.petclinic.pet.entity.Pet

interface ListPetsGateway {
    fun listPets() : List<Pet>
}