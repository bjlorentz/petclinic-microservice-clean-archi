package fr.lorentz.petclinic.usecase

import fr.lorentz.petclinic.annotation.UseCase

@UseCase
class SimpleUseCase {
    fun getState() = "Available"
}