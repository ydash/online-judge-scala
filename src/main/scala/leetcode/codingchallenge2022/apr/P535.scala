package leetcode.codingchallenge2022.apr

// 535. Encode and Decode TinyURL
object P535 {

  class Codec {
    private val table = collection.mutable.Map[String, String]()
    private val baseUrl = "http://tinyurl.com/"
    // Encodes a URL to a shortened URL.
    def encode(longURL: String): String = {
      val compressed = longURL.hashCode.toHexString
      table += (compressed -> longURL)
      s"$baseUrl$compressed"
    }

    // Decodes a shortened URL to its original URL.
    def decode(shortURL: String): String = {
      val compressed = shortURL.replace(baseUrl, "")
      table(compressed)
    }
  }
}
