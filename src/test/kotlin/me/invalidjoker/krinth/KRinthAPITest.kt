package me.invalidjoker.krinth

import kotlinx.coroutines.runBlocking
import kotlin.test.Test

class KRinthAPITest {

    val api = KRinthAPI(staging = true)

    @Test
    fun testProject() {
        val d = runBlocking {
            return@runBlocking api.projects.getProject("fabric-api")
        }

        d?.let {
            println(it.versions)
        }
    }

    @Test
    fun testVersions() {
        val d = runBlocking {
            return@runBlocking api.versions.getVersions("fabric-api")
        }

        d?.let {
            println(it)
        }
    }

    @Test
    fun testVersion() {
        val d = runBlocking {
            return@runBlocking api.versions.getVersion("cXkV2nJO")
        }

        d?.let {
            println(it)
        }
    }
}