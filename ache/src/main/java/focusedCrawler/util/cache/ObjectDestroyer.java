/*
############################################################################
##
## Copyright (C) 2006-2009 University of Utah. All rights reserved.
##
## This file is part of DeepPeep.
##
## This file may be used under the terms of the GNU General Public
## License version 2.0 as published by the Free Software Foundation
## and appearing in the file LICENSE.GPL included in the packaging of
## this file.  Please review the following to ensure GNU General Public
## Licensing requirements will be met:
## http://www.opensource.org/licenses/gpl-license.php
##
## If you are unsure which license is appropriate for your use (for
## instance, you are interested in developing a commercial derivative
## of DeepPeep), please contact us at deeppeep@sci.utah.edu.
##
## This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING THE
## WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.
##
############################################################################
*/
package focusedCrawler.util.cache;



/**

 * Interface para o destruidor de objetos de cache

 *

 * Toda vez que um objeto for removido da cache

 * a cache chama o metodo destruct passando o objeto como parametro

 * para que seja feitos os controles necessarios antes que o objeto

 * seja perdido

 *

 *

 * @author Oscar Miranda

 * @version 1,0, 2001

 */

public interface ObjectDestroyer {



    /**

     * @param data os dados que foram removidos da cache

     */

    public void destruct(Object data) throws DestroyerException;

}

