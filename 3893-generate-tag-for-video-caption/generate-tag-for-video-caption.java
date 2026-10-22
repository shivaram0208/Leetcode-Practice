class Solution {
    public String generateTag(String caption) {
        caption = caption.trim();
        String arr[] = caption.split("\\s+");
        StringBuilder sb = new StringBuilder();
        sb.append("#");
        for(int i = 0; i < arr.length; i++)
        {
            String str = arr[i];
            str = str.replaceAll("[^a-zA-Z]", "");
            str = str.toLowerCase();
            if(i == 0)
                sb.append(str);
            else
                sb.append(str.substring(0, 1).toUpperCase() + str.substring(1));
        }
        if(sb.length() >= 101)
            return (sb.toString()).substring(0, 100);
        return sb.toString();
    }
}