/*
 * Copyright 2015 Bernd Vogt and others.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.sourcepit.yala;
public class Optional {
   private java.util.Optional<String> value = java.util.Optional.empty();
   private java.util.Optional<Integer> value1 = java.util.Optional.of(Integer.valueOf(10));
   private java.util.Optional<Integer> value2 = java.util.Optional.empty();

   public java.util.Optional<String> doSth(java.util.Optional<Integer> i) {
      return java.util.Optional.ofNullable("");
   }

   public String doSth(Integer i) {
      assert i != null;
      
      final String _return = "";
      assert _return != null;
      return _return;
   }
}
