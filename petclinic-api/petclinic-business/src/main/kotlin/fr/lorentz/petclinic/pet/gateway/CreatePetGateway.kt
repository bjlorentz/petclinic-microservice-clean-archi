package fr.lorentz.petclinic.pet.gateway

import fr.lorentz.petclinic.pet.entity.Pet

interface CreatePetGateway {
    fun create(pet: Pet) : Pet
}