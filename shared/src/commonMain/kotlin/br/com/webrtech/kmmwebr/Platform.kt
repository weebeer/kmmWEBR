package br.com.webrtech.kmmwebr

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform