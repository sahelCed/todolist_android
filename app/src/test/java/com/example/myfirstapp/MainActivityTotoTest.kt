package com.example.myfirstapp

import junit.framework.TestCase.assertTrue
import org.junit.Test


class MainActivityTotoTest {

    @Test
    fun `Check Valid Password`() {
        // Setup
        val password = "Passw0rld123!"
        // Test
        val errors = verifyPassword(password)
        // Resultat
        assertTrue(errors.isEmpty())
    }


    @Test
    fun `Check length`() {
        // Setup
        val password = "Passw0rld123!"
        // Test
        val errors = verifyPassword(password)
        // Resultat
        assertTrue(!errors.contains("Le mot de passe doit contenir au moins 6 caractères."))
    }

    @Test
    fun `Check Uppercase`() {
        // Setup
        val password = "Passw0rld123"
        // Test
        val errors = verifyPassword(password)
        // Resultat
        assertTrue(!errors.contains("Le mot de passe doit contenir au moins une lettre majuscule."))
    }

    @Test
    fun `Check lowercase`() {
        // Setup
        val password = "Passw0rld123"
        // Test
        val errors = verifyPassword(password)
        // Resultat
        assertTrue(!errors.contains("Le mot de passe doit contenir au moins une lettre minuscule."))
    }

    @Test
    fun `Check contain number`() {
        // Setup
        val password = "Passw0rld123"
        // Test
        val errors = verifyPassword(password)
        // Resultat
        assertTrue(!errors.contains("Le mot de passe doit contenir au moins un chiffre."))
    }
}