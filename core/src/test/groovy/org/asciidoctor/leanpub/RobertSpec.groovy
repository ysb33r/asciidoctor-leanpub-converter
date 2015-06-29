package org.asciidoctor.leanpub

import org.asciidoctor.leanpub.internal.LeanpubSpecification
import spock.lang.Specification


/**
 * @author Schalk W. Cronjé
 */
class RobertSpec extends LeanpubSpecification {

    def "Simple Table"() {
        setup:
        File chapter = new File(manuscriptDir, 'chapter_1.txt')
        generateOutput('tables.adoc')

        expect:
        false
    }
}