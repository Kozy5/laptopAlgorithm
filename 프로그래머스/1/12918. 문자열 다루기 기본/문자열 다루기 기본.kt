class Solution {
    fun solution(s: String) = s.let{((s.length == 4) ||(s.length == 6))&& s.toIntOrNull() !=null }
}