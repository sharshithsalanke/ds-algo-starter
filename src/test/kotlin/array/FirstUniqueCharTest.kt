package array

import io.kotest.core.spec.style.StringSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class FirstUniqueCharTest : StringSpec({
    "firstUniqueChar" {
        forAll(
            row("leetcode", 0),
            row("loveleetcode", 2),
            row("aaabbbbc",7),
            row("madam",2),
            row("hannah",-1),
            row("aabb", -1),
            row("aaaaaa",-1),
        ) { s, result ->
            First_Unique.firstUniqueChar(s) shouldBe result
        }
    }
})